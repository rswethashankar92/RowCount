import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class DQReduce extends Reducer<Text,NullWritable,Text,NullWritable>{
	public void reduce(Text key,Iterable <NullWritable> value, Context context){
		try {
			context.write(key,NullWritable.get());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
