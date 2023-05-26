package top.agno.info;

import lombok.Data;

import java.util.List;

@Data
public class MockMethodInfo {
    String belongClazzReference;
    String methodName;
    List<ParamInfo> paramInfoList;
    MethodReturnInfo methodReturnInfo;
}
