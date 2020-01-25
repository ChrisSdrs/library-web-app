<nav class="d-none d-md-block bg-light sidebar">
    <div class="sidebar-sticky">
        <ul class="nav flex-column">

            <li class="nav-item
                <#if page?has_content>
                    <#if
                page == "Home">active
                    </#if>
                </#if>

            ">
                <a class="nav-link" href="/home">
                    <div class="sidebar-link-text">Home</div>
                </a>
            </li>
        <#if userRole?has_content>
            <#if
        userRole == "Admin">

                <li class="">
                    <div class="sidebar-title">Users</div>
                </li>

                <li class="nav-item nav-users
                    <#if page?has_content>
                        <#if
                    page == "Users">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/users">
                        <div class="sidebar-link-text">All Members</div>
                    </a>
                </li>


                <#if page?has_content>
                    <#if
                page == "User-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <div class="sidebar-link-text">Edit Member</div>
                        </div>
                    </li>
                    </#if>
                </#if>



                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Users-Search">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/users/search">
                        <div class="sidebar-link-text">Search for Members</div>
                    </a>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Users-Create">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/users/create">
                        <div class="sidebar-link-text">Create User</div>
                    </a>
                </li>

                <li class="">
                    <div class="sidebar-title">Borrows</div>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                            page == "Borrows">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link " href="/admin/borrows">
                        <div class="sidebar-link-text">All Borrows</div>
                    </a>
                </li>

                <#if page?has_content>
                    <#if
                    page == "Borrow-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <div class="sidebar-link-text">Edit Borrow</div>
                        </div>
                    </li>
                    </#if>
                </#if>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Borrows-Search">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/borrows/search">
                        <div class="sidebar-link-text">Search for borrows</div>
                    </a>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Borrows-Create">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/borrows/create">
                        <div class="sidebar-link-text">Create Borrow</div>
                    </a>
                </li>

                <li class="">
                    <div class="sidebar-title">Books</div>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Books">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/books">
                        <div class="sidebar-link-text">All Books</div>
                    </a>
                </li>

                <#if page?has_content>
                    <#if
                    page == "Books-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <div class="sidebar-link-text">Edit Book</div>
                        </div>
                    </li>
                    </#if>
                </#if>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Books-Search">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/books/search">
                        <div class="sidebar-link-text">Search Book</div>
                    </a>
                </li>

                <li class="nav-item
                    <#if page?has_content>
                        <#if
                    page == "Books-Create">active
                        </#if>
                    </#if>
                ">
                    <a class="nav-link" href="/admin/books/create">
                        <div class="sidebar-link-text">Create Book</div>
                    </a>
                </li>
            </#if>
        </#if>
            <li class="nav-item">
                <a class="nav-link" href="/logout" id="logout-item">
                    <div class="sidebar-link-text">Logout</div>
                </a>
            </li>
        </ul>
    </div>
</nav>