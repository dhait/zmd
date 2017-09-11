<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>${pagetitle}</title>
    <#if styles??>
    <#list styles as style>
        <link rel="stylesheet" type="text/css" href="${style}">
    </#list>
    </#if>
    <link rel="stylesheet" type="text/css" href="${zstyle}">
</head>
<body>
<#if title??>
<#list title as t>
    <h1 class="title">${t}</h1>
</#list>
</#if>
<#if author??>
<#list author as auth>
    <div class="author">${auth}</div>
</#list>
</#if>
<#if date??>
<#list date as d>
    <div class="date">${d}</div>
</#list>
</#if>
${body}
</body>
</html>