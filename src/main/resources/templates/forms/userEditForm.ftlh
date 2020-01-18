<#import "/spring.ftl" as spring />

<form action="/admin/users/edit" id="userVal" name="userEditForm" method="POST">


    <input type="hidden" name="id" value="${member.id}">


    <div class="mb-3">
        <label for="ssn">SSN</label>
            <input type="text" class="form-control" id="ssn" name="ssn" value="${member.ssn}" readonly>
    </div>

    <div class="mb-3">
        <label for="firstName">First Name</label>
            <input type="text" class="form-control" id="firstName" name="firstName"  value="${member.firstName}">
    </div>

    <div class="mb-3">
        <label for="lastName">Last Name</label>
            <input type="text" class="form-control" id="lastName" name="lastName" value="${member.lastName}">
        </div>

    <div class="mb-3">
        <label for="address">Address</label>
            <input type="text" class="form-control" id="address" name="address"  value="${member.address}">
    </div>

    <div class="mb-3">
        <label for="email">E-mail</label>
            <input type="email" class="form-control" id="email" name="email"  value="${member.email}">
    </div>

    <div class="mb-3">
        <label for="phone">Phone</label>
            <input type="text" class="form-control" id="phone" name="phone"  value="${member.phone}">
    </div>

    <div class="mb-3">
        <label for="username">Username</label>
            <input type="text" class="form-control" id="username" name="username"  value="${member.username}" readonly>
    </div>

    <div class="mb-3 Ghost">
        <label for="role">Role</label>
            <input type="hidden" class="form-control" id="role" name="role" value="${member.role}">
    </div>


    <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
</form>