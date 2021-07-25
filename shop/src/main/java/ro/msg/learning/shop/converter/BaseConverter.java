package ro.msg.learning.shop.converter;

import ro.msg.learning.shop.dto.BaseDTO;
import ro.msg.learning.shop.model.BaseEntity;

public interface BaseConverter<Entity extends BaseEntity , DTO extends BaseDTO> {
    Entity dtoToEntity(DTO dto);
    DTO entityToDto(Entity entity);
}
