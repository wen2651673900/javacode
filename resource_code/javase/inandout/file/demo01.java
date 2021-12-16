package inandout.file;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class demo01 {
    public static void main(String[]args) throws IOException {
        System.out.println(new File("").getCanonicalPath());
        String path = "C://Java//Java_Code//resource_code//javase//inandout//testfile//";
        System.out.println(File.separator);
        //文件对象
        File file = new File(path+"test1.txt");
        System.out.println("判断文件是否存在："+file.exists());
        //如果文件不存在则就创建
        if(!file.exists()){
            //创建新的文件
            file.createNewFile();
        }


        //通过另一种方式构建
        File file1 = new File(path+"//f1//f2//f3");
        if(!file1.exists()){
            file1.mkdir();//创建单层文件夹
            file1.mkdirs();//创建多层文件夹
        }


        //是用第二种构造器
        File file2 = new File(file1,"text2.txt");
        if(!file2.exists()){
            file2.createNewFile();//如果文件存在则就不能创建
        }



        //判断文件类型
        System.out.println("判断当前file对象是否是一个目录"+file1.isDirectory());
        System.out.println("判断当前file对象是否是一个文件"+file.isFile());
        //隐藏属性测试
        System.out.println(file.isHidden());



        //删除文件：删除的那个文件必须保证那个文件没有子文件子目录
        file1.delete();
        //如果没有指定盘符，默认放到当前项目的根目录
        File file3 = new File("123.txt");
        if(!file3.exists()){
            file3.createNewFile();
        }
        //文件对象的当前路径
        String this_path = file3.getPath();
        //文件对象的绝对路径
        String abs_path = file3.getAbsolutePath();
        //获取当前电脑的盘符
        File[] roots = File.listRoots();
        System.out.println(Arrays.toString(roots));
        //获取当前文件的名称
        System.out.println(file3.getName());
        //文件的长度,Unicode编码中文占两个字符，utf-8中文占3字符
        System.out.println(file2.length());
        //获取文件上次修改的毫秒数
        long date = file2.lastModified();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        //修改文件名称
        File file4 = new File("456.txt");
        boolean flag = file3.renameTo(file4);
        System.out.println("修改文件名称"+flag);


        //  ./指代当前路径的父目录
        File file5 = new File(".");
        System.out.println(Arrays.toString(file5.listFiles()));
        File[] files = file5.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(files));
        myfind(file5);
    }
    public static void myfind(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                if(f.isDirectory()){
                    myfind(f);
                }else{
                    if(f.getName().endsWith(".txt")){
                        System.out.println(f.getName());
                    }
                }
            }
        }
    }
}
