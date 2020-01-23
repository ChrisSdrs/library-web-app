<form action="/admin/books/search" name="bookSearchForm" method="POST">

    <div class="mb-3">
        <@spring.bind "bookSearchForm.bookPin"/>
        <input type="text" class="form-control" name="bookPin" id="bookPin" placeholder="Book's PIN" value="<#if bookSearchForm.bookPin?has_content>${bookSearchForm.bookPin}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <@spring.bind "bookSearchForm.category"/>
        <input type="text" class="form-control" name="category" id="category" placeholder="Book Category" value="<#if bookSearchForm.category?has_content>${bookSearchForm.category}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Search</button>
</form>
