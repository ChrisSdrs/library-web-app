<table class="table table-striped table-sm">

    <thead>
    <tr>
        <th>Social Security Number</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>E-mail</th>
        <th>Phone</th>
    </tr>
    </thead><tbody>
    <#if userDetails?has_content>
        <tr>
            <td> ${userDetails.membNumber}</td>
            <td> ${userDetails.firstName}</td>
            <td> ${userDetails.lastName}</td>
            <td> ${userDetails.email}</td>
            <td> ${userDetails.phone}</td>
        </tr>
    </#if>
    </tbody>
</table>