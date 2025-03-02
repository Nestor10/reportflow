package com.example.reportflow.login

import sttp.tapir.Schema
import dev.cheleb.scalamigen.NoPanel
import com.example.reportflow.domain.Password

@NoPanel
final case class LoginPassword(login: String, password: Password) derives zio.json.JsonCodec, Schema:
  def isIncomplete: Boolean = login.isBlank || password.isBlank
