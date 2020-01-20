
<form action="/admin/users/create" id="userVal" name="userCreateForm" method="POST">


    <div class="mb-3">
        <label for="membNumber">Membership Number</label>
        <@spring.bind "userCreateForm.membNumber"/>
        <input type="text" class="form-control" name="membNumber" id="membNumber" placeholder="Membership Number" value="<#if userCreateForm.membNumber?has_content>${userCreateForm.membNumber}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="firstName">First Name</label>
        <@spring.bind "userCreateForm.firstName"/>
        <input type="text" class="form-control" name="firstName" id="firstName" placeholder="First Name" value="<#if userCreateForm.firstName?has_content>${userCreateForm.firstName}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>

    <div class="mb-3">
        <label for="lastName">Last Name</label>
        <@spring.bind "userCreateForm.lastName"/>
        <input type="text" class="form-control" name="lastName" id="lastName" placeholder="Last Name" value="<#if userCreateForm.lastName?has_content>${userCreateForm.lastName}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <label for="email">E-mail</label>
        <@spring.bind "userCreateForm.email"/>
        <input type="email" class="form-control" name="email" id="email" placeholder="E-mail" value="<#if userCreateForm.email?has_content>${userCreateForm.email}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="phone">Phone</label>
        <@spring.bind "userCreateForm.phone"/>
        <input type="text" class="form-control" name="phone" id="phone" placeholder="Phone" value="<#if userCreateForm.phone?has_content>${userCreateForm.phone}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="username">Username</label>
        <@spring.bind "userCreateForm.username"/>
        <input type="text" class="form-control" name="username" id="username" placeholder="Username" value="<#if userCreateForm.ssn?has_content>${userCreateForm.ssn}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="password">Password</label>
        <@spring.bind "userCreateForm.password"/>
        <input type="text" class="form-control" name="password" id="password" placeholder="Password" value="<#if userCreateForm.password?has_content>${userCreateForm.password}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="role">Role</label>
        <@spring.bind "userCreateForm.role"/>
        <select class="custom-select d-block w-100" name="role" id="role" required="">
            <option value="" selected class="first-select-label">Choose Role</option>
            <option value="Member"   <#if userCreateForm.role?has_content && userCreateForm.role == "Member"> selected </#if>>
                Member
            </option>
            <option value="Admin"   <#if userCreateForm.role?has_content && userCreateForm.role == "Admin"> selected </#if>>
                Admin
            </option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <#if memberCreateError?has_content>
        <div><p class="error">
                ${memberCreateError}
            </p>
        </div>
    </#if>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>
