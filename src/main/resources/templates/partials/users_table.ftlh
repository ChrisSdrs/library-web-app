<table class="table table-striped table-sm">

    <thead>
    <tr>
        <th>Membership Number</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>E-mail</th>
        <th>Phone</th>
        <th>Edit</th>
        <th class="text-center">Delete</th>
    </tr>
    </thead><tbody>
    <#if users?has_content>
        <#list users as user>
            <tr data-id="${user.id}">
                <td> ${user.membNumber}</td>
                <td> ${user.firstName}</td>
                <td> ${user.lastName}</td>
                <td> ${user.email}</td>
                <td> ${user.phone}</td>
                <td class="Edit-Delete">
                    <form action="/admin/users/${user.id}/edit" method="POST" style="display: inline;">
                        <button type="submit" class="btn btn-link"><span data-feather="x"><svg class="bi bi-pencil" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M13.293 3.293a1 1 0 011.414 0l2 2a1 1 0 010 1.414l-9 9a1 1 0 01-.39.242l-3 1a1 1 0 01-1.266-1.265l1-3a1 1 0 01.242-.391l9-9zM14 4l2 2-9 9-3 1 1-3 9-9z" clip-rule="evenodd"></path>
  <path fill-rule="evenodd" d="M14.146 8.354l-2.5-2.5.708-.708 2.5 2.5-.708.708zM5 12v.5a.5.5 0 00.5.5H6v.5a.5.5 0 00.5.5H7v.5a.5.5 0 00.5.5H8v-1.5a.5.5 0 00-.5-.5H7v-.5a.5.5 0 00-.5-.5H5z" clip-rule="evenodd"></path>
</svg></span></button>
                    </form>
                </td>
                <td class="Edit-Delete">
                    <button type="button" class="btn btn-link" data-toggle="modal" data-target="#deleteConfirmationModal" data-id="${user.id}" data-link="/admin/users/${user.id}/delete" >
                        <span><svg class="bi bi-backspace" width="1em" height="1em" viewBox="0 0 20 20" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M8.603 4h7.08a1 1 0 011 1v10a1 1 0 01-1 1h-7.08a1 1 0 01-.76-.35L3 10l4.844-5.65A1 1 0 018.603 4zm7.08-1a2 2 0 012 2v10a2 2 0 01-2 2h-7.08a2 2 0 01-1.519-.698L2.241 10.65a1 1 0 010-1.302L7.084 3.7A2 2 0 018.603 3h7.08z" clip-rule="evenodd"></path>
  <path fill-rule="evenodd" d="M7.83 7.146a.5.5 0 000 .708l5 5a.5.5 0 00.707-.708l-5-5a.5.5 0 00-.708 0z" clip-rule="evenodd"></path>
  <path fill-rule="evenodd" d="M13.537 7.146a.5.5 0 010 .708l-5 5a.5.5 0 01-.708-.708l5-5a.5.5 0 01.707 0z" clip-rule="evenodd"></path>
</svg></span>
                    </button>
                </td>
            </tr>
        </#list>
    </#if>
    </tbody>
</table>


