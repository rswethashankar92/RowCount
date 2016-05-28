import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;



public class RcountMap extends Mapper<LongWritable,Text,Text,NullWritable>{
	public void map(LongWritable key,Text value,Context context){
		context.getCounter(MyCounter.RowCounters.ROWS).increment(1);
	}
}
