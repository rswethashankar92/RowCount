import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


public class DQMap extends Mapper<LongWritable,Text,Text,NullWritable>{
	
	public void map(LongWritable key,Text value,Context context) {
		String v = value.toString().toUpperCase();
		try {
			context.write(new Text(v), NullWritable.get());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


