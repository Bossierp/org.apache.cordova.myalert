/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/

package org.apache.cordova.myalert;

import org.json.JSONArray;
import org.json.JSONException;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Context;
import android.app.AlertDialog;

public class myalert extends CordovaPlugin {

  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    if ("myalert".equals(action)) {
      try {
        Alert("Hello World");
      } catch (Exception e) {
        return false;
      }
      callbackContext.success();
      return true;
    }
    return false;
  }

  private void Alert(String msg) {
    Dialog alertDialog = new AlertDialog.Builder(this.cordova.getActivity()).
    setTitle("对话框的标题").
    setMessage(msg).
    setCancelable(false).
    setNegativeButton("确定", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialog, int which) {
        // TODO Auto-generated method stub
      }
    }).
    create();
    alertDialog.show();
  }
}