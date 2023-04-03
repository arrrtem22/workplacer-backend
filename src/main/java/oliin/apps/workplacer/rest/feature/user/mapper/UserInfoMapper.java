package oliin.apps.workplacer.rest.feature.user.mapper;

import oliin.apps.workplacer.domain.model.user.UserInfo;
import oliin.apps.workplacer.rest.feature.user.CreateUserController;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(unmappedTargetPolicy = ReportingPolicy.ERROR)
@Mapper(componentModel = "spring")
public interface UserInfoMapper {
    UserInfo toUserInfo(CreateUserController.CreateUserRequest request);

}
