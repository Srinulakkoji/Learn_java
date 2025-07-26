package org.multiThreading.workStealPoolExecutor;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class WorkStealPoolExecutorIntro {
    static class ComputeSumTask extends RecursiveTask<Integer>{
        int start;
        int end;

        ComputeSumTask(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {

            if( end - start <= 4){
                int totalSum = 0;
                for (int i = start; i <= end; i++){
                    totalSum+= i;
                }
                return totalSum;
            }else{
                int mid = (start + end)/2;
                ComputeSumTask leftTask = new ComputeSumTask(start,mid);
                ComputeSumTask rightTask = new ComputeSumTask(mid+1, end);

                leftTask.fork();
                rightTask.fork();

                int leftResult = leftTask.join();
                int rightResult = rightTask.join();

                return leftResult + rightResult;
            }
        }
    }
    public static void main(String[] args) {
        //internally worked as forkjoin()
        ForkJoinPool pool = ForkJoinPool.commonPool();

        Future<Integer> futureObj = pool.submit(new ComputeSumTask(0,100));

        try{
            System.out.println(futureObj.get());
        }catch (Exception e){

        }
    }
}
