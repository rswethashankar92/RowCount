import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class DQDC extends Configured{
public static void main(String[] args) throws Throwable{
	Job job = new Job();
	
	job.setJarByClass(DQDC.class);
	job.setMapperClass(DQMap.class);
	job.setReducerClass(DQReduce.class);
	
	FileInputFormat.setInputPaths(job, new Path(args[0]));
	FileOutputFormat.setOutputPath(job, new Path(args[1]));
	
	job.setInputFormatClass(TextInputFormat.class);
	
	job.setOutputKeyClass(Text.class);
	job.setOutputValueClass(NullWritable.class);
	
	job.waitForCompletion(true);
}
}
