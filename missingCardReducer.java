import java.io.IOException;
import java.util.Iterator;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class missingCardReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

    @Override
    public void reduce(Text key, Iterable<IntWritable> values, Context output)
            throws IOException, InterruptedException {
        int cardCount = 0;
        for(IntWritable value: values){
        	cardCount+= value.get();
        }
       
        int missingFlag=0;
        if(cardCount<2){
            missingFlag=1;
        }
        if(missingFlag==1){
        	cardCount=0;
            output.write(key, new IntWritable(cardCount));
        }
       
    }
}
