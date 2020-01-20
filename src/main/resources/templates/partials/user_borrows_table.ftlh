<table class="table table-striped table-sm">
    <thead>
    <tr>
        <th>Date</th>
        <th>Status</th>
        <th>Book's PIN</th>
        <th>Membership Number</th>
    </tr>
    </thead>
    <tbody>
    <#if userBorrows?has_content>
        <#list userBorrows as borrow>
            <tr>
                <td> ${borrow.date}</td>
                <td> ${borrow.status}</td>
                <td> ${borrow.bookPin}</td>
                <td> ${borrow.membNumber}</td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>