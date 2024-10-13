import { FavoriteListItem } from 'types/interface';
import ResponseDto from '../response.dto';

export default interface GetFavoriteListResponseDto extends ResponseDto {
    favoriteList: FavoriteListItem[]; // 좋아요 목록 배열
}