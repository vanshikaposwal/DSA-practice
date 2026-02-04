package Array;

public class MaximumPopulation {
    public static void main (String[] args){
            int[][] logs={{1993,1999},{2000,2010}};
                    int max = 0;
                            int count=0;
                                    // int birth=0;
                                            // int death =1;
                                                    int year=0;
                                                            for(int person=1; person<logs.length; person++){
                                                                        if(logs[person][0] < logs[person-1][1]){
                                                                                        count++;
                                                                                                        if(max < count){
                                                                                                                            max = count;
                                                                                                                                                year = logs[person][0];
                                                                                                                                                                }
                                                                                                                                                                            }else{
                                                                                                                                                                                            count =0;
                                                                                                                                                                                                        }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                        if(max == 1){
                                                                                                                                                                                                                                    year = logs[0][0];
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                    System.out.println(year);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                        