package com.bcm.businesscarmanagementapi.enumerate;

public enum UserPermission {

    COURSE_READ("course:read"),
    COURSE_WRITE("course:write"),
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write");

    private final String permission;

    UserPermission(String permission){
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
