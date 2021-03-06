package com.krux.starport.db.record

import org.joda.time.DateTime


case class SchedulerMetric(
  startTime: DateTime,
  piplineCount: Option[Int] = None,
  endTime: Option[DateTime] = None
)
