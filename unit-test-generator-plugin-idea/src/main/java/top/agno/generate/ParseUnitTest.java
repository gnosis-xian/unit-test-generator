package top.agno.generate;

import cn.hutool.core.io.FileUtil;
import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaSource;
import top.agno.info.MethodInfo;
import top.agno.info.MethodReference;
import top.agno.info.MockMethodInfo;
import top.agno.util.ParseUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ParseUnitTest {

    public static void parseMethod(MethodInfo result, String projectLocation, String srcDir, String methodReference) throws IOException {
        MethodReference parsedMethodReference = ParseUtil.parseClazz(methodReference);
        result.setMethodName(parsedMethodReference.getMethodName());
        result.setParamClazz(parsedMethodReference.getParamClazzReference());
        result.setClazzReference(parsedMethodReference.getClazzReference());

        parseMock(FileUtil.file(projectLocation, srcDir, ParseUtil.parseClazzLocation(methodReference), ".java"));
    }

    private static List<MockMethodInfo> parseMock(File clazzFile) throws IOException {
        List<MockMethodInfo> resultList = new ArrayList<>();
        JavaProjectBuilder javaProjectBuilder = new JavaProjectBuilder();
        JavaSource javaSource = javaProjectBuilder.addSource(clazzFile);
        Class<? extends JavaSource> clazz = javaSource.getClass();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            MockMethodInfo result = new MockMethodInfo();
            result.setBelongClazzReference(clazz.getName());
        }
        return resultList;
    }
}
