<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    hello ${content}<br>
<#list hobbys as hobby>
    ${hobby}
</#list>
<#list users as user>
    ${user_index+1}|${user.username}||${user.password}||${user.age}
</#list>
<#if username=="songge">
    松哥真帅
    <#elseif username="zhaoge">
    钊哥真帅
    <#else >
    我真帅
</#if>
${current?string("yyyy-MM-dd HH:mm:ss")}
<#if username??>
    username不为空
</#if>
${abc! ""}
<#include "extra.ftl">
</body>
</html>