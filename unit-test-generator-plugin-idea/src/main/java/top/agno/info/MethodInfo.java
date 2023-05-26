package top.agno.info;

import cn.hutool.core.lang.Pair;
import lombok.Data;

import java.util.List;

@Data
public class MethodInfo {
    String clazzReference;
    String methodName;
    String paramClazz;
    List<MockMethodInfo> mockMethodInfoList;
}
