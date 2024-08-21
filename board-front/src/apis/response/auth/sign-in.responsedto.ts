import ResponseDto from '../response.dto';

export default interface SignInResponseDto extends ResponseDto{
    token: string;
    expiratonTime: number;
}