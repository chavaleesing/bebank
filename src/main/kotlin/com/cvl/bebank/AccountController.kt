package com.cvl.bebank

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class ViewAccount(
    val id: Int,
    val name: String
)

data class CreateAccount(
    val name: String
)


@RestController
@RequestMapping("/account")
class AccountController {

    @GetMapping("/all")
    fun getAll(): Iterable<ViewAccount> =
        listOf(ViewAccount(id=1, name = "acc101"))

    @PostMapping("/new")
    fun create(@RequestBody req: CreateAccount): ViewAccount =
        ViewAccount(id=2, name=req.name)

}