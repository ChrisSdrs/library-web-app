<#import "/spring.ftl" as spring />

<form action="/admin/books/create" id="bookVal" name="bookForm" method="POST">

    <div class="mb-3">
        <label for="pin">Book's PIN</label>
        <@spring.bind "bookForm.pin"/>
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Pin">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="title">Book's title</label>
        <@spring.bind "bookForm.title"/>
        <input type="text" class="form-control" name="title" id="title" placeholder="Title">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="publicationDate">Publication date</label>
        <@spring.bind "bookForm.publicationDate"/>
        <input type="text" class="form-control" name="publicationDate" id="publicationDate" placeholder="Publication date">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="category">Book category</label>
        <@spring.bind "bookForm.category"/>
        <select class="custom-select d-block w-100" name="category" id="category" required="">
            <option value="" class="first-select-label" selected>Choose book category</option>
            <option>Literary realism</option>
            <option>Drama</option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

<#--    <div class="mb-3">-->
<#--        <label for="owner">Owner's SSN</label>-->
<#--        <@spring.bind "bookForm.owner"/>-->
<#--        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's Social Security Number">-->
<#--        <#list spring.status.errorMessages as error>-->
<#--            <span>${error}</span>-->
<#--        </#list>-->
<#--    </div>-->

    <#if bookCreateError?has_content>
        <div><p class="error">
                ${bookCreateError}
            </p>
        </div>
    </#if>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>
