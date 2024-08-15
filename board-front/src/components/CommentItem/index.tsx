import React from 'react'
import './style.css';
import { CommentListItem } from 'types/interface';
import defaultProfileImage from 'assets/image/default-profile-image.png';
interface Props{
    commentListItem: CommentListItem;
}
// compnent: comment List Item 컴포넌트 //
export default function CommentItem({commentListItem}: Props) {
// properties //
    const {nickname, profileImage, writeDatetime, content} = commentListItem;
// compnent: comment List Item 랜더링 //
  return (
    <div className='commnet-list-item'>
        <div className='commnet-list-item-top'>
            <div className='commnet-list-item-profile-box'>
                <div className='commnet-list-item=profile-image' style={{backgroundImage:`url(${profileImage ? profileImage : defaultProfileImage})`}}></div>
            </div>
            <div className='commnet-list-item-nickname'>{nickname}</div>
            <div className='commnet-list-item-divider'>{'\|'}</div>
            <div className='commnet-list-item-time'>{writeDatetime}</div>
        </div>
        <div className='commnet-list-item-main'>
            <div className='commnet-list-item-content'>{content}</div>
        </div>
    </div>
  )
}
