<form action="/admin/repairs/edit" id="repairVal" name="borrowForm" method="POST">


    <input type="hidden" name="id" value="${borrow.id}">

    <div class="mb-3">
        <label for="date">Date</label>
        <@spring.bind "borrowForm.date"/>
        <input type="date" class="form-control" name="date" id="date" value="${borrow.date}" required>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="status">Status</label>
        <@spring.bind "borrowForm.status"/>
        <select class="custom-select d-block w-100" name="status" id="status" value="${borrow.status}" required>
            <option value="" class="first-select-label">Choose Status</option>
            <option value="Pending"   <#if borrow.status == "Pending"> selected </#if>>
                Pending
            </option>
            <option value="In progress" <#if borrow.status == "In Progress"> selected </#if>>
                In Progress
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
        <label for="category">Category</label>
        <@spring.bind "borrowForm.category"/>
        <select class="custom-select d-block w-100" name="category" id="category" required="">
           <option value="" selected class="first-select-label">Choose Category</option>
           <option value="Interior"   <#if borrow.category == "Interior"> selected </#if>>
               Interior
           </option>
           <option value="Exterior"   <#if borrow.category == "Exterior"> selected </#if>>
               Exterior
           </option>
        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <div class="mb-3">
        <label for="type">Type</label>
        <@spring.bind "borrowForm.type"/>
        <select class="custom-select d-block w-100" name="type" id="type"  required="">
            <option value="" class="first-select-label">Choose Repair Type</option>
            <#if borrow.category == "Interior">
                <option value="Painting"   <#if borrow.type == "Painting"> selected </#if>>
                    Painting
                </option>
                <option value="Electrical"   <#if borrow.type == "Electrical"> selected </#if>>
                    Electrical
                </option>
                <option value="Plumbing"   <#if borrow.type == "Plumbing"> selected </#if>>
                    Plumbing
                </option>
                <option value="Insulation"   <#if borrow.type == "Insulation"> selected </#if>>
                    Insulation
                </option>
                <option value="Fireplace"   <#if borrow.type == "Fireplace"> selected </#if>>
                    Fireplace
                </option>
                <option value="Frames"   <#if borrow.type == "Frames"> selected </#if>>
                    Frames
                </option>
                <option value="Ceramic Flooring"   <#if borrow.type == "Ceramic Flooring"> selected </#if>>
                    Ceramic Flooring
                </option>
                <option value="Ceiling"   <#if borrow.type == "Ceiling"> selected </#if>>
                    Ceiling
                </option>

            <#elseif borrow.category == "Exterior">
                <option value="Solar Panels"   <#if borrow.type == "Solar Panels"> selected </#if>>
                    Solar Panels
                </option>
                <option value="Painting"   <#if borrow.type == "Painting"> selected </#if>>
                    Painting
                </option>
                <option value="Swimming Pool"   <#if borrow.type == "Swimming Pool"> selected </#if>>
                    Swimming Pool
                </option>
                <option value="Fences"   <#if borrow.type == "Fences"> selected </#if>>
                    Fences
                </option>
            </#if>

        </select>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>

    </div>
    <div class="mb-3">
        <label for="cost">Cost</label>
        <@spring.bind "borrowForm.cost"/>
        <input type="text" class="form-control" name="cost" id="cost" value="${borrow.cost}" placeholder="Cost">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="owner">Owner</label>
        <@spring.bind "borrowForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" value="${borrow.owner}" placeholder="Owner's SSN">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="address">Address</label>
        <@spring.bind "borrowForm.address"/>
        <input type="text" class="form-control" name="address" id="address" value="${borrow.address}" placeholder="Property Address">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="description">Description</label>
        <@spring.bind "borrowForm.description"/>
        <textarea class="form-control" name="description" id="description" placeholder="Description" rows="4" cols="50">${borrow.description}</textarea>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>