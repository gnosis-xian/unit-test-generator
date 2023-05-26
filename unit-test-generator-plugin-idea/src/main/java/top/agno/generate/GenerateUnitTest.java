package top.agno.generate;

import cn.hutool.core.io.FileUtil;
import com.squareup.javapoet.MethodSpec;
import com.thoughtworks.qdox.JavaProjectBuilder;
import com.thoughtworks.qdox.model.JavaSource;
import lombok.Data;
import top.agno.info.MethodInfo;
import top.agno.info.MethodReference;
import top.agno.info.MockMethodInfo;
import top.agno.util.ParseUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class GenerateUnitTest {

    MethodInfo methodInfo;

    public GenerateUnitTest(MethodInfo methodInfo) {
        this.methodInfo = methodInfo;
    }

    public void generate() {
        JavaProjectBuilder javaProjectBuilder = new JavaProjectBuilder();
        MethodSpec.methodBuilder(methodInfo.getMethodName())
                .
    }


}
