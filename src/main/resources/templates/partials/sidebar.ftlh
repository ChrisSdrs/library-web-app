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
                    <img src="https://img.icons8.com/wired/64/000000/speed.png" class="nav-link-icon">

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
                        <img src="https://img.icons8.com/ios-filled/50/000000/user-group-man-man.png" class="nav-link-icon">

                        <div class="sidebar-link-text">All Members</div>
                    </a>
                </li>


                <#if page?has_content>
                    <#if
                page == "User-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <img src="https://img.icons8.com/ios-filled/50/000000/pencil-tip.png" class="nav-link-icon">
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
                        <img src="https://img.icons8.com/ios-glyphs/30/000000/find-user-male.png" class="nav-link-icon">
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
                        <img src="https://img.icons8.com/ios-filled/50/000000/add-user-male.png" class="nav-link-icon">
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
                        <img src="https://img.icons8.com/ios-filled/50/000000/gears.png" class="nav-link-icon">
                        <div class="sidebar-link-text">All Borrows</div>
                    </a>
                </li>

                <#if page?has_content>
                    <#if
                    page == "Borrow-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <img src="https://img.icons8.com/ios-filled/50/000000/pencil-tip.png" class="nav-link-icon">
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
                        <img src="https://img.icons8.com/ios-filled/50/000000/advanced-search.png" class="nav-link-icon">
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
                        <img src="https://img.icons8.com/ios/50/000000/calendar-plus.png" class="nav-link-icon">
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
                        <img src="https://img.icons8.com/ios-filled/50/000000/real-estate.png" class="nav-link-icon">
                        <div class="sidebar-link-text">All Books</div>
                    </a>
                </li>

                <#if page?has_content>
                    <#if
                    page == "Books-Edit"><li class="nav-item nav-users active">
                        <div class="nav-link" >
                            <img src="https://img.icons8.com/ios-filled/50/000000/pencil-tip.png" class="nav-link-icon">
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
                        <img src="https://img.icons8.com/ios-filled/50/000000/search-book.png" class="nav-link-icon">
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
                        <img src="https://img.icons8.com/ios-filled/50/000000/add-to-inbox.png" class="nav-link-icon">
                        <div class="sidebar-link-text">Create Book</div>
                    </a>
                </li>
            </#if>
        </#if>
<#--        <#if userRole?has_content>-->
<#--                    <#if-->
<#--                userRole == "Member">-->

<#--                 <li class="" style="margin-top: 60px;">-->
<#--                    <div class="coming-soon-holder">-->
<#--                        <img class="coming-soon" src="https://freepngimg.com/download/coming_soon/7-2-coming-soon-png-picture.png">-->
<#--                    </div>-->
<#--                 </li>-->

<#--                <li class="">-->
<#--                    <img src="https://img.icons8.com/ios/50/000000/calendar-plus.png" class="nav-link-icon">-->
<#--                    <div class="sidebar-link-text">Arrange Repair</div>-->
<#--                </li>-->

<#--                <li class="">-->
<#--                    <img src="https://img.icons8.com/ios-filled/50/000000/add-to-inbox.png" class="nav-link-icon">-->
<#--                    <div class="sidebar-link-text">Add Book</div>-->
<#--                </li>-->

<#--            </#if>-->
<#--        </#if>-->
        </ul>


    </div>
</nav>