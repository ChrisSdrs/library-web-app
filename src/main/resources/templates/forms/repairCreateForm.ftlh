<#import "/spring.ftl" as spring />

<form action="/admin/repairs/create" id="repairVal" name="borrowForm" method="POST">
    <div class="mb-3">
        <label for="date">Date</label>
        <@spring.bind "borrowForm.date"/>
        <input type="date" class="form-control" name="date" id="date" required value="<#if borrowForm.date?has_content>${borrowForm.date}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="status">Status</label>
        <@spring.bind "borrowForm.status"/>
        <select class="custom-select d-block w-100" name="status" id="status" required >
            <option value="" selected class="first-select-label">Choose Status</option>
            <option value="Pending"   <#if borrowForm.status?has_content && borrowForm.status == "Pending"> selected </#if>>
                Pending
            </option>
            <option value="In Progress"   <#if borrowForm.status?has_content && borrowForm.status == "In Progress"> selected </#if>>
                In Progress
            </option>
            <option value="Completed"   <#if borrowForm.status?has_content && borrowForm.status == "Completed"> selected </#if>>
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
        <select class="custom-select d-block w-100" name="category" id="category" required=>
           <option value="" selected class="first-select-label">Choose Category</option>
            <option value="Interior"   <#if borrowForm.category?has_content && borrowForm.category == "Interior"> selected </#if>>
                Interior
            </option>
            <option value="Exterior"   <#if borrowForm.category?has_content && borrowForm.category == "Exterior"> selected </#if>>
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
        <select class="custom-select d-block w-100" name="type" id="type" required >
           <option value="" selected class="first-select-label">Choose Category First</option>
            <#if borrowForm.category?has_content && borrowForm.category == "Interior">
                <option value="Painting"   <#if borrowForm.type?has_content && borrowForm.type == "Painting"> selected </#if>>
                    Painting
                </option>
                <option value="Electrical"   <#if borrowForm.type?has_content && borrowForm.type == "Electrical"> selected </#if>>
                    Electrical
                </option>
                <option value="Plumbing"   <#if borrowForm.type?has_content && borrowForm.type == "Plumbing"> selected </#if>>
                    Plumbing
                </option>
                <option value="Insulation"   <#if borrowForm.type?has_content && borrowForm.type == "Insulation"> selected </#if>>
                    Insulation
                </option>
                <option value="Fireplace"   <#if borrowForm.type?has_content && borrowForm.type == "Fireplace"> selected </#if>>
                    Fireplace
                </option>
                <option value="Frames"   <#if borrowForm.type?has_content && borrowForm.type == "Frames"> selected </#if>>
                    Frames
                </option>
                <option value="Ceramic Flooring"   <#if borrowForm.type?has_content && borrowForm.type == "Ceramic Flooring"> selected </#if>>
                    Ceramic Flooring
                </option>
                <option value="Ceiling"   <#if borrowForm.type?has_content && borrowForm.type == "Ceiling"> selected </#if>>
                    Ceiling
                </option>

            <#elseif borrowForm.category?has_content && borrowForm.category == "Exterior">
                <option value="Solar Panels"   <#if borrowForm.type?has_content && borrowForm.type == "Solar Panels"> selected </#if>>
                    Solar Panels
                </option>
                <option value="Painting"   <#if borrowForm.type?has_content && borrow.type == "Painting"> selected </#if>>
                    Painting
                </option>
                <option value="Swimming Pool"   <#if borrowForm.type?has_content && borrow.type == "CSwimming Pool"> selected </#if>>
                    Swimming Pool
                </option>
                <option value="Fences"   <#if borrowForm.type?has_content && borrow.type == "Fences"> selected </#if>>
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
        <input type="text" class="form-control" name="cost" id="cost" placeholder="Cost" value="<#if borrowForm.cost?has_content>${borrowForm.cost}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
        <label for="owner">Owner</label>
        <@spring.bind "borrowForm.owner"/>
        <input type="text" class="form-control" name="owner" id="owner" placeholder="Owner's SSN" value="<#if borrowForm.owner?has_content>${borrowForm.owner}</#if>">
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>
    <div class="mb-3">
           <label for="address">Address</label>
           <@spring.bind "borrowForm.address"/>
           <input type="text" class="form-control" name="address" id="address" placeholder="Property Address" value="<#if borrowForm.address?has_content>${borrowForm.address}</#if>">
           <#list spring.status.errorMessages as error>
               <span>${error}</span>
           </#list>
    </div>
    <div class="mb-3">
        <label for="description">Description</label>
        <@spring.bind "borrowForm.description"/>
        <textarea class="form-control" name="description" id="description" placeholder="Description" rows="4" cols="50"><#if borrowForm.description?has_content>${borrowForm.description}</#if></textarea>
        <#list spring.status.errorMessages as error>
            <span>${error}</span>
        </#list>
    </div>

    <#if repairCreateError?has_content>
        <div><p class="error">
                ${repairCreateError}
            </p>
        </div>
    </#if>

    <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
</form>
