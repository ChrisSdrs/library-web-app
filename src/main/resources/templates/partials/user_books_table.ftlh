<table class="table table-striped table-sm">

    <thead>
    <tr>
        <th>Property Identification Number</th>
<#--        <th>Address</th>-->
<#--        <th>Year of Construction</th>-->
<#--        <th>Property Type</th>-->
    </tr>
    </thead><tbody>
    <#if userBooks?has_content>
        <#list userBooks as book>
            <tr>
                <td> ${book.pin}</td>
<#--                <td> ${book.address}</td>-->
<#--                <td> ${book.year}</td>-->
<#--                <td> ${book.type}</td>-->
            </tr>
        </#list>
    </#if>
    </tbody>
</table>