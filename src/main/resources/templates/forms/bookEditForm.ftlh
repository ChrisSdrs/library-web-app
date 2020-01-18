<form action="/admin/books/edit" id="bookVal" name="bookForm" method="POST">


    <input type="hidden" name="id" value="${book.id}">

    <div class="mb-3">
        <label for="pin">Book's PIN</label>
        <@spring.bind "bookForm.pin"/>
        <input type="text" class="form-control" name="pin" id="pin" placeholder="Pin" value="${book.pin}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="title">Book's title</label>
        <@spring.bind "bookForm.title"/>
        <input type="text" class="form-control" name="title" id="title" placeholder="Title" value="${book.title}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="publicationDate">Publication date</label>
        <@spring.bind "bookForm.publicationDate"/>
        <input type="text" class="form-control" name="publicationDate" id="publicationDate" placeholder="Publication date" value="${book.publicationDate}">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="category">Book category</label>
        <@spring.bind "bookForm.category"/>
        <select class="custom-select d-block w-100" name="category" id="category" required="">
            <option value="" class="first-select-label" selected>Choose book category</option>
            <option value="Literary realism"   <#if book.category == "Literary realism"> selected </#if>>
                Literary realism
            </option>
            <option value="Drama"   <#if book.category == "Drama"> selected </#if>>
                Drama
            </option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

<#--    <div class="mb-3">-->
<#--        <label for="owner">Owner</label>-->
<#--        <@spring.bind "bookForm.owner"/>-->
<#--        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's Social Security Number" value="${book.owner}">-->
<#--        <#list spring.status.errorMessages as error>-->
<#--            <span>${error}</span>-->
<#--        </#list>-->
<#--    </div>-->


    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>
