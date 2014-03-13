package zw.freemarker;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class HelloFreemarker {

	public static void main(String[] args) throws Exception{
		Configuration cfg = new Configuration();
		File f = new File(HelloFreemarker.class.getClassLoader().getResource("freemarker").getFile());
		cfg.setDirectoryForTemplateLoading(f);
		
		Template temp = cfg.getTemplate("hello.ftl");
		Writer out = new OutputStreamWriter(System.out);
		temp.process(null, out);
	}

}
