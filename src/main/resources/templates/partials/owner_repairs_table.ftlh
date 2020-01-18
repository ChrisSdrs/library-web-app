<table class="table table-striped table-sm">
    <thead>
    <tr>
        <th>Date</th>
        <th>Status</th>
        <th>Category</th>
        <th>Type</th>
        <th>Cost</th>
        <th>Address</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>
    <#if userRepairs?has_content>
        <#list userRepairs as borrow>
            <tr>
                <td> ${borrow.date}</td>
                <td> ${borrow.status}</td>
                <td> ${borrow.category}</td>
                <td> ${borrow.type}</td>
                <td> ${borrow.cost}</td>
                <td> ${borrow.address}</td>
                <td> ${borrow.description}</td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>