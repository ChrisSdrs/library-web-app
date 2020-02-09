<form action="/admin/borrows/edit" id="borrowVal" name="borrowForm" method="POST">


    <input type="hidden" name="id" value="${borrow.id}">

    <div class="mb-3">
        <label for="date">Borrow Date</label>
        <@spring.bind "borrowForm.date"/>
        <input type="date" class="form-control" name="date" id="date" value="${borrow.date}" required>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="returnDate">Return Date</label>
        <@spring.bind "borrowForm.returnDate"/>
        <input type="date" class="form-control" name="returnDate" id="returnDate" value="${borrow.returnDate}" required>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="status">Status</label>
        <@spring.bind "borrowForm.status"/>
        <select class="custom-select d-block w-100" name="status" id="status" value="${borrow.status}" required>
            <option value="" class="first-select-label">Choose Status</option>
            <option value="In progress" <#if borrow.status == "In progress"> selected </#if>>
                In progress
            </option>
            <option value="Completed" <#if borrow.status == "Completed"> selected </#if>>
                Completed
            </option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <label for="bookPin">Book's PIN</label>
        <@spring.bind "borrowForm.bookPin"/>
        <input type="text" class="form-control" name="bookPin" id="bookPin" value="${borrow.bookPin}" placeholder="Book's PIN">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="bookTitle">Book's Title</label>
        <@spring.bind "borrowForm.bookTitle"/>
        <input type="text" class="form-control" name="bookTitle" id="bookTitle" value="${borrow.bookTitle}" placeholder="Book's Title">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="membNumber">Member's Membership Number</label>
        <@spring.bind "borrowForm.membNumber"/>
        <input type="text" class="form-control" name="membNumber" id="membNumber" value="${borrow.membNumber}" placeholder="Membership Number">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Confirm</button>
</form>