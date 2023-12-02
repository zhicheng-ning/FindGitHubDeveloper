package cn.nzcer.findgithubdeveloper.enums;

/**
 * @project: FindGitHubDeveloper
 * @ClassName: BlogStatusEnum
 * @author: nzcer
 * @creat: 2023/12/2 16:45
 * @description:
 */
public enum BlogStatusEnum {
    EXIST(1, "YES"),
    NOT_EXIST(0, "No"),
    NOT_CARE(-1, "Not Care");
    private final Integer code;
    private final String  message;

    BlogStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static BlogStatusEnum ofBlogStatusEnum(Integer code) {
        for (BlogStatusEnum blogStatusEnum : BlogStatusEnum.values()) {
            if (blogStatusEnum.getCode().equals(code)) {
                return blogStatusEnum;
            }
        }
        return null;
    }
}
