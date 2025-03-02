package com.example.reportflow.config

import sttp.model.Uri

final case class BackendClientConfig(
  baseUrl: Option[Uri]
)
