package IO.file;

import java.io.File;
import java.io.IOException;

/**
 * @author ZhangNan
 * @date 2019/11/16 10:01
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//当前路径来创建一个File对象
		File file = new File(".");
		System.out.println("获取文件名:"+file.getName());
		System.out.println("获取相对路径的父路径"+file.getParent());
		System.out.println("获取绝对路径:" + file.getAbsolutePath());
		System.out.println("获取上一级的路径:" + file.getAbsoluteFile().getParent());


		/*//当前路径下创建一个临文件
		File tempFile = File.createTempFile("aaa", ".text", file);
		//制定当jvm退出事删除文件
		tempFile.deleteOnExit();
		//指定当前时间作为新文件名来创建文件
		File newFile = new File(System.currentTimeMillis() + "");
		System.out.println("newFile 对象是否存在:" + newFile.exists());
		//指定一个newFile对象来创建一个文件
		newFile.createNewFile();
		boolean mkdir = newFile.mkdir();
		System.out.println("创建文件状态:"+mkdir);
		//使用list()方法列出当前路径下的所有文件和路径
		String[] list = file.list();
		System.out.println("当前路径下所有文件和路径");
		for (String s : list) {
			System.out.println(s);
		}
		//listRoots静态方法列出所以的磁盘根路径
		File[] roots = File.listRoots();
		System.out.println("系统所有的根目录如下");
		for (File root : roots) {
			System.out.println(root);
		}*/
	}
}
