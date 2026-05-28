package CoreJava_Revision;

public class AvgArray {
    public static void main(String[] args) {
        double d[]={1,3.5,2.4,8};
        double avg=0;
        if(d.length>0){
            double sum=0;
            for(double r:d){
                sum=sum+r;
            }
            avg=sum/d.length;
        }
        System.out.println("avg: "+avg);
    }
}
