
<form action="/admin/users/search" name="userSearchForm" method="POST">

    <div class="mb-3">
        <@spring.bind "userSearchForm.membNumber"/>
        <input type="text" class="form-control" name="membNumber" id="membNumber" placeholder="Member Number" value="<#if userSearchForm.membNumber?has_content>${userSearchForm.membNumber}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <@spring.bind "userSearchForm.email"/>
        <input type="text" class="form-control" name="email" id="email" placeholder="e-mail"  value="<#if userSearchForm.email?has_content>${userSearchForm.email}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit" onclick="Alert("User Search")">Search</button>
</form>
