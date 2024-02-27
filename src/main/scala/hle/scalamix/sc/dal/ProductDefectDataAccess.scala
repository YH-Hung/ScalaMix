package hle.scalamix.sc.dal

import hle.scalamix.dao.ProductDefectRepository
import hle.scalamix.entity.ProductDefect
import hle.scalamix.sc.model.SingleDefectKey
import scalaz.Reader

import scala.jdk.OptionConverters.*

object ProductDefectDataAccess {
  
  // TODO: ReaderT
  // TODO: Do not return entity, model instead
  def findById(key : SingleDefectKey) : Reader[ProductDefectRepository, Option[ProductDefect]] = {
    Reader(repo => repo.findById_ProductIdAndId_InspectDateAndId_DefectId(key.productId, key.inspectDt, key.defectId))
  }
}
