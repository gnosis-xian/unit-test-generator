package top.agno.info;

import lombok.Data;

@Data
public class MethodReturnInfo {
    String clazzReference;
    Object returnObj;
    boolean hasGeneric;
    String genericClazzReference;
}
