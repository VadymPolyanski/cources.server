package com.softgroup.messenger.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.messenger.api.message.DeleteConversationRequest;
import com.softgroup.messenger.api.message.DeleteConversationResponse;
import com.softgroup.messenger.api.router.MessengerRequestHandler;

/**
 * Author: vadym
 * Date: 25.02.17
 * Time: 19:43
 */
public class DeleteConversationHandler
        extends AbstractRequestHandler<DeleteConversationRequest,
            DeleteConversationResponse> implements MessengerRequestHandler {
    @Override
    public String getName() {
        return "loginHandler";
    }

    @Override
    public Response<DeleteConversationResponse> doHandle(Request<DeleteConversationRequest> request) {
        return null;
    }
}