<form action="/admin/books/search" name="bookSearchForm" method="POST">

    <div class="mb-3">
        <@spring.bind "bookSearchForm.pin"/>
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Book's PIN" value="<#if bookSearchForm.pin?has_content>${bookSearchForm.pin}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <@spring.bind "bookSearchForm.membNumber"/>
        <input type="text" class="form-control" name="membNumber" id="membNumber" placeholder="Member's Membership Number" value="<#if bookSearchForm.membNumber?has_content>${bookSearchForm.membNumber}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
