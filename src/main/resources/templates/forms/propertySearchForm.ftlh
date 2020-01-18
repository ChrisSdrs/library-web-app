<form action="/admin/properties/search" name="bookSearchForm" method="POST">

    <div class="mb-3">
        <@spring.bind "bookSearchForm.pin"/>
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Property Identification Number" value="<#if bookSearchForm.pin?has_content>${bookSearchForm.pin}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <@spring.bind "bookSearchForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's Social Security Number" value="<#if bookSearchForm.owner?has_content>${bookSearchForm.owner}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
