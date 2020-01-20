<form action="/admin/borrows/search" name="searchBorrowForm" method="POST">
    <div class="mb-3">
        <label for="dateFrom">From</label>
        <@spring.bind "searchBorrowForm.dateFrom"/>
        <input type="date" class="form-control mr-sm-2" name="dateFrom" id="dateFrom" value="<#if searchBorrowForm.dateFrom?has_content>${searchBorrowForm.dateFrom}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="dateTo">To</label>
        <@spring.bind "searchBorrowForm.dateTo"/>
        <input type="date" class="form-control mr-sm-2" name="dateTo" id="dateTo" value="<#if searchBorrowForm.dateTo?has_content>${searchBorrowForm.dateTo}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <@spring.bind "searchBorrowForm.membNumber"/>
        <input type="text" class="form-control mr-sm-2" name="membNumber" id="membNumber" placeholder="Membership Number" value="<#if searchBorrowForm.membNumber?has_content>${searchBorrowForm.membNumber}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>


    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
