package chapter11.filter;

import java.io.File;
import java.io.FileFilter;

/**
 * 创建FileFilter的实现类
 * @author Crossing
 * @date 2019-03-19
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {

        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
