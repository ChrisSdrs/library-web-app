<html>
<head>
    <title>Member Details</title>
    <link rel="stylesheet" href="/styles/member.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/chart.js@2.9.3/dist/Chart.min.js">
    <link rel="stylesheet" href="https://www.jsdelivr.com/package/npm/chart.js">
    <#include "../partials/head.ftlh">
</head>
<body>



<#assign page = "Home">
<#include "../partials/main_content_top.ftlh">

<h3 class="mb-3">
    <#if userDetails?has_content>
        ${userDetails.firstName}
        ${userDetails.lastName},
        ${userDetails.membNumber}
    </#if>
</h3>
<div class="table-responsive">


    <h4 class="mb-3">My Borrows</h4>
    <#include "../partials/user_borrows_table.ftlh" />

</div>


<#include "../partials/main_content_bottom.ftlh">
<#include "../partials/scripts.ftlh">
<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
<#--<script src="/scripts/reportCharts.js"></script>-->
</body>
</html>